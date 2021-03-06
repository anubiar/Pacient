package com.pacienti.pacient.DTO;

import java.util.List;

import com.pacienti.pacient.Model.TratamentDao;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Tratamente {
    private long totalElements;
    private int totalPages;
    private List<TratamentDao> tratamente;

    public Tratamente(long totalElements, int totalPages, List<TratamentDao> tratamente) {
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.tratamente = tratamente;
    }
}
