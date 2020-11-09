package com.stanzaliving.core.generic.validation.fieldProcessors;


import com.stanzaliving.core.base.enums.Department;

import com.stanzaliving.core.generic.constants.GenericConstants;
import com.stanzaliving.core.generic.validation.dtos.ErrorInfo;
import com.stanzaliving.core.generic.validation.dtos.TemplateField;
import com.stanzaliving.core.generic.validation.dtos.UiParentField;
import com.stanzaliving.core.generic.validation.enums.ActorAction;
import com.stanzaliving.core.generic.validation.enums.ActorRole;
import com.stanzaliving.core.generic.validation.utility.CommonUtilities;
import com.stanzaliving.core.vendor.enums.VendorStatusEnum;
import lombok.extern.log4j.Log4j2;


import java.util.Map;
import java.util.Objects;
public interface ApprovalProcessor {
    void checkAndUpdateApprovalLevels(TemplateField field, Map<String,Object> additionalData);
    void processApproval(UiParentField uiParentField, TemplateField field, Map<String, Object> additionalData, ErrorInfo errorInfo);
    boolean isAllApproved(Integer currentUserApprovedLevel);
    void setApprovalLevel(Integer approvalLevel);
    Integer getApprovalLevel();

    default void fillApprovalInfo(UiParentField uiField, TemplateField field, Map<String, Object> additionalData){
        if(!field.isApprovable()) {
            uiField.setApproved(false);
            uiField.setCanApprove(false);
            return;
        }

        Integer currentUserApprovedLevel =  (Integer) additionalData.get(GenericConstants.currentApprovedLevelOrderKey);
        ActorRole currentRole = (ActorRole) additionalData.get(GenericConstants.actorRoleKey);
        boolean canApprove = (currentRole==ActorRole.APPROVE) && (currentUserApprovedLevel-this.getApprovalLevel()==1 || currentUserApprovedLevel-this.getApprovalLevel()==0) &&
                (Objects.isNull(field.getApprovalDetails()) || CommonUtilities.canApprove((Department)additionalData.get(GenericConstants.queryDepartmentKey),currentUserApprovedLevel,field.getApprovalDetails()));
        if(!canApprove)
        {
            Integer maxApprovalLevel =  Objects.isNull(field.getApprovalDetails())?(Integer) additionalData.get(GenericConstants.maxApprovalLevelKey):field.getApprovalDetails().getApprovalLevels();
            uiField.setApproved(Objects.isNull(this.getApprovalLevel())?false:this.getApprovalLevel()>=maxApprovalLevel);
            uiField.setCanApprove(false);
        }else {
            uiField.setApproved(this.getApprovalLevel()>=currentUserApprovedLevel);
            uiField.setCanApprove(true);
        }

    }

//    default void updateIndividualSectionApproval(boolean approved,  Map<String, Object> additionalData){
//        Integer currentUserApprovedLevel =  (Integer) additionalData.get(GenericConstants.currentApprovedLevelOrderKey);
//        if((currentUserApprovedLevel-this.getApprovalLevel()==1 || currentUserApprovedLevel-this.getApprovalLevel()==0)) {
//            if (!approved) {
//                Integer rejectionLevel = currentUserApprovedLevel - 1;
//                this.setApprovalLevel(rejectionLevel);
//                return;
//            } else
//                this.setApprovalLevel(currentUserApprovedLevel);
//        }
//    }

    default void updateIndividualSectionApproval(UiParentField uiParentField, TemplateField field, Map<String, Object> additionalData, ErrorInfo errorInfo){
        if(!field.isApprovable()){
            this.setApprovalLevel(GenericConstants.approvalRestrictMax);
            return;
        }
        ActorAction currentAction = (ActorAction)additionalData.get(GenericConstants.currentAction);
        Integer currentUserApprovedLevel =  (Integer) additionalData.get(GenericConstants.currentApprovedLevelOrderKey);
        if(currentAction==ActorAction.REJECT)
        {
            Integer rejectionLevel = VendorStatusEnum.getVendorStatus(GenericConstants.rejectionStart-currentUserApprovedLevel).getOrder();
            this.setApprovalLevel(rejectionLevel);
            return;
        }
        ActorRole currentRole = (ActorRole) additionalData.get(GenericConstants.actorRoleKey);

        boolean canApprove = (currentRole==ActorRole.APPROVE) && (currentUserApprovedLevel-this.getApprovalLevel()==1 || currentUserApprovedLevel-this.getApprovalLevel()==0) &&
                (Objects.isNull(field.getApprovalDetails()) || CommonUtilities.canApprove((Department)additionalData.get(GenericConstants.queryDepartmentKey),currentUserApprovedLevel,field.getApprovalDetails()));
        if(canApprove){
            if(uiParentField.isApproved())
                this.setApprovalLevel(currentUserApprovedLevel);
            else
            {
                this.setApprovalLevel(currentUserApprovedLevel-1);
                CommonUtilities.setErrorMsg(field.getAlias()+" needs approval.",errorInfo,uiParentField);
            }
        }
    }

    default void updateParentSectionApproval(UiParentField uiParentField, TemplateField field, Map<String, Object> additionalData, ErrorInfo errorInfo){

        if(!field.isApprovable()){
            this.setApprovalLevel(GenericConstants.approvalRestrictMax);
            return;
        }

        ActorAction currentAction = (ActorAction)additionalData.get(GenericConstants.currentAction);
        ActorRole currentRole = (ActorRole) additionalData.get(GenericConstants.actorRoleKey);
        Integer currentUserApprovedLevel =  (Integer) additionalData.get(GenericConstants.currentApprovedLevelOrderKey);
        if(currentAction==ActorAction.REJECT)
        {
            Integer rejectionLevel = VendorStatusEnum.getVendorStatus(GenericConstants.rejectionStart-currentUserApprovedLevel).getOrder();
            this.setApprovalLevel(rejectionLevel);
            return;
        }

        boolean canApprove = (currentRole==ActorRole.APPROVE) && (currentUserApprovedLevel-this.getApprovalLevel()==1 || currentUserApprovedLevel-this.getApprovalLevel()==0) &&
                (Objects.isNull(field.getApprovalDetails()) || CommonUtilities.canApprove((Department)additionalData.get(GenericConstants.queryDepartmentKey),currentUserApprovedLevel,field.getApprovalDetails()));

        if(!canApprove)
            return;

        if(this.isAllApproved(currentUserApprovedLevel))
        {
            uiParentField.setApproved(true);
            this.setApprovalLevel(currentUserApprovedLevel);
        }
        else
        {
            this.setApprovalLevel(currentUserApprovedLevel-1);
            uiParentField.setApproved(false);
            CommonUtilities.setErrorMsg("All points not approved",errorInfo,uiParentField);
        }
    }

    default boolean hasUpdatedApprovalLevelsOnChange(Integer approvalLevel, boolean tempVendor, boolean approvable){
        if(tempVendor)
        {
            this.setApprovalLevel(approvalLevel);
            return true;
        }
        if(approvable && Objects.isNull(this.getApprovalLevel()))
        {
            this.setApprovalLevel(approvalLevel);
            return true;
        }
        if(!approvable)
        {
            this.setApprovalLevel(GenericConstants.approvalRestrictMax);
            return true;
        }
        if(this.getApprovalLevel() < VendorStatusEnum.SUBMITTED.getOrder() && approvalLevel==VendorStatusEnum.SUBMITTED.getOrder())
        {
            this.setApprovalLevel(VendorStatusEnum.SUBMITTED.getOrder());
            return true;
        }
//        if(this.getApprovalLevel()<=VendorStatusEnum.SUBMITTED.getOrder())
//            return true;
        return false;
    }
}

