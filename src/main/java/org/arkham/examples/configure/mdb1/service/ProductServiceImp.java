package org.arkham.examples.configure.mdb1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.arkham.examples.configure.mdb1.model.AuditLog;
import org.arkham.examples.configure.mdb1.model.Category;
import org.arkham.examples.configure.mdb1.model.Product;
import org.arkham.examples.configure.mdb1.repository.AuditLogRepository;
import org.arkham.examples.configure.mdb1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImp implements IProductService {

    private final ProductRepository repository;

    private final IAuditLogService logService;

    @Override
    public Optional<Product> saveProduct(String username, Product product) {
        final Product save = this.repository.save(product);
        final AuditLog auditLog = AuditLog.builder().operation("product registration")
                .description("se registra un nuevo producto al inventario")
                .userName(username).build();
        if (save != null) {
            log.info("product was stored correctly...");
            auditLog.setStatusOperation("success");
        } else {
            log.error("product was not saved...");
            auditLog.setStatusOperation("error");
        }
        this.logService.saveAuditLog(auditLog);
        return Optional.of(save);
    }

    @Override
    public List<Product> getProductsByCategory(String username, Category category) {
        return repository.findProductByCategory(category);
    }

    @Override
    public List<Product> getProductsByName(String username, String name) {
        return repository.findProductByName(name);
    }
}
