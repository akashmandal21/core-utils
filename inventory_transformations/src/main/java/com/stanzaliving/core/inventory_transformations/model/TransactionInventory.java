package com.stanzaliving.core.inventory_transformations.model;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TRANSACTION_INVENTORY")
public class TransactionInventory {

	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_INVENTORY_ID")
	private int transactionInventoryId;

	@Column(name = "TRANSACTION_ID", nullable = false)
	private int transactionId;

	@Column(name = "I_SURE_PAY_URL", nullable = false)
	private String iSurePayUrl;

}
