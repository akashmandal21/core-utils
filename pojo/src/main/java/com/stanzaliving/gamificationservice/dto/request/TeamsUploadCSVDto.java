package com.stanzaliving.gamificationservice.dto.request;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.*;
import lombok.experimental.SuperBuilder;


    @Getter
    @Setter
    @ToString
    @SuperBuilder
    @NoArgsConstructor
    @AllArgsConstructor


    public class TeamsUploadCSVDto {


        @CsvBindByName(column = "team_name")
        @CsvBindByPosition(position = 5)
        private String teamName;

        @CsvBindByPosition(position = 1)
        @CsvBindByName(column = "location")
        private String location;

        @CsvBindByPosition(position = 7)
        @CsvBindByName(column = "date_of_joining")
        private String dateOfJoining;

        @CsvBindByPosition(position = 8)
        @CsvBindByName( column = "users")
        private String users;

        @CsvBindByName(column = "zone")
        @CsvBindByPosition(position = 0)
        private String zone;

        @CsvBindByName(column = "cluster_manager")
        @CsvBindByPosition(position = 4)
        private String clusterManager;

        @CsvBindByPosition(position = 3)
        @CsvBindByName(column = "no_of_members")
        private int noOfMembers;

        @CsvBindByPosition(position = 2)
        @CsvBindByName(column = "clusterName")
        private String clusterName;

        @CsvBindByPosition(position = 6)
        @CsvBindByName(column = "cluster_member_names")
        private String clusterMemberNames;

        @CsvBindByPosition(position = 10)
        @CsvBindByName(column = "uploaded_background_file_url")
        private String uploadedBackgroundFileUrl;

        @CsvBindByPosition(position = 9)
        @CsvBindByName(column = "uploaded_front_file_url")
        private String uploadedFrontFileUrl;

        @CsvBindByPosition(position = 11)
        @CsvBindByName(column = "bucket")
        private String bucket;

        @CsvBindByPosition(position = 12)
        @CsvBindByName(column = "file_name")
        private String  fileName;

        @CsvBindByPosition(position = 13)
        @CsvBindByName(column = "file_path")
        private String filePath;

    }


