package com.stanzaliving.debezium;

import javax.validation.constraints.NotBlank;

public class TableStructure {

   @NotBlank
   private String sourceDatabase;
   @NotBlank
   private String sourceTable;
   private String destDatabase;
   private String destTable;
}
