package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 */
@Getter
@AllArgsConstructor
public enum TicketRaisedForType {

  /**
   * Resident
   */
  RESIDENT("Resident"), 
  /**
   * Self
   */
  SELF("Self"), 
  /**
   * SL Staff
   */
  SL("Sl Staff");

  String name;
}
