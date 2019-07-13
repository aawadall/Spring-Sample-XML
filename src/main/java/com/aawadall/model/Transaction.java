package com.aawadall.model;

import java.util.Date;
import java.util.UUID;

/**
 * Foundation of Cash Management System This Transaction entity will capture
 * Debits and credits related to a vault
 */
public class Transaction {
    /**
     * Transaction Date
     */
    private Date date;

    /**
     * Master ID for the transaction, used to link transaction legs
     */
    private UUID masterUuid;

    /**
     * transaction leg ID
     */
    private UUID legUuid;

    /**
     * transaction description
     */
    private String description;
    // TODO: Define Transaction Amount
    // TODO: Define Transaction Sign
}