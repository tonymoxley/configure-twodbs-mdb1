package org.arkham.examples.configure.mdb1.service;

import lombok.extern.slf4j.Slf4j;
import org.arkham.examples.configure.mdb1.model.AuditLog;
import org.arkham.examples.configure.mdb1.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Slf4j
@Service
public class AuditLogServiceImp implements IAuditLogService {

    private final AuditLogRepository repository;

    @Autowired
    public AuditLogServiceImp(AuditLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog) {
        return this.repository.save(auditLog);
    }

    @Override
    public List<AuditLog> getAuditLogsByUser(String username) {
        return null;
    }

    @Override
    public List<AuditLog> getAuditLogsByOperation(String operation) {
        return null;
    }
}
