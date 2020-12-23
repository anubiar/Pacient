package com.pacienti.pacient.Model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Retete {
    private long totalElements;
    private int totalPages;
    private List<RetetaDao> retete;

    public Retete(long totalElements, int totalPages, List<RetetaDao> retete) {
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.retete = retete;
    }
}
