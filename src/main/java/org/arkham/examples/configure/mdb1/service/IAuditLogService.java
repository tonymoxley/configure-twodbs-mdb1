package org.arkham.examples.configure.mdb1.service;

import org.arkham.examples.configure.mdb1.model.AuditLog;

import java.util.List;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
public interface IAuditLogService {

    /**
     *
     * @param auditLog
     * @return
     */
    AuditLog saveAuditLog(AuditLog auditLog);

    /**
     *
     * @param username
     * @return
     */
    List<AuditLog> getAuditLogsByUser(String username);

    /**
     *
     * @param operation
     * @return
     */
    List<AuditLog> getAuditLogsByOperation(String operation);

}
