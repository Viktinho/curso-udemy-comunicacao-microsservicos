package br.com.cursoudemy.productapi.modules.supplier.dto;

import br.com.cursoudemy.productapi.modules.supplier.model.Supplier;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class SupplierResponse {

    private Integer id;
    private String name;

    public static SupplierResponse of(Supplier suppllier) {
        var response = new SupplierResponse();
        BeanUtils.copyProperties( suppllier, response);
        return response;
    }
}
