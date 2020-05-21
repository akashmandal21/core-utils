package com.stanzaliving.dashboard.enums;

public enum CityMicromarketResidenceType {
    CITY{
        public String getGroupBy() {
            return "group by city_uuid";
        }
    }, MICROMARKET{
        public String getGroupBy() {
            return "group by micromarket_uuid";
        }

    }, RESIDENCE{
        public String getGroupBy() {
            return "group by residence_uuid";
        }
    };
    public String getWhereCondition(){
        return " where residence_uuid in (:residenceUuid) " +
                "and micromarket_uuid in (:micromarketUuid) and city_uuid in (:cityUuid)";
    }
    public abstract String getGroupBy();
}
