package com.pacienti.pacient.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "tratament")
public class TratamentDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pozitie;

    @ManyToOne
    @JoinColumn(name = "diagnostic_id")
    private DiagnosticDao diagnostic;
    
    @ManyToOne()
    @JoinColumn(name = "cod_medicament")
    private MedicamentDao medicament;

    private Double cantitate;

    

}
