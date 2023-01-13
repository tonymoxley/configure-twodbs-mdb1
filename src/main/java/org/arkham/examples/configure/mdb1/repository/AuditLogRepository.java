package org.arkham.examples.configure.mdb1.repository;

import org.arkham.examples.configure.mdb1.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Integer> {

    /**
     *
     * @param userName
     * @return
     */
    List<AuditLog> findAuditLogByUserName(String userName);

    /**
     *
     * @param operation
     * @return
     */
    List<AuditLog> findAuditLogByOperation(String operation);

}