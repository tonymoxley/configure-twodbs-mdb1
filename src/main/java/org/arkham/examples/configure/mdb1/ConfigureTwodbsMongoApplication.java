package org.arkham.examples.configure.mdb1;

import lombok.extern.slf4j.Slf4j;
import org.arkham.examples.configure.mdb1.model.AuditLog;
import org.arkham.examples.configure.mdb1.service.IAuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * @author Ing. jose Antonio Hernandez
 * @version 1.0
 */
@Slf4j
@SpringBootApplication
public class ConfigureTwodbsMongoApplication implements CommandLineRunner {

	@Autowired
	private IAuditLogService logService;

	public static void main(String[] args) {
		SpringApplication.run(ConfigureTwodbsMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final AuditLog auditLog = new AuditLog();
		auditLog.setOperation("login-user");
		auditLog.setDescription("usuario inicio sesion");
		auditLog.setUserName("Lizbeth Trixie");
		auditLog.setDateOperation(LocalDateTime.now());

		final AuditLog auditLog1 = this.logService.saveAuditLog(auditLog);
		log.info("inserted record: {}", auditLog1.toString());
	}
}
