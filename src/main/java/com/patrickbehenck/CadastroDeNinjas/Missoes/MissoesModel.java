package com.patrickbehenck.CadastroDeNinjas.Missoes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.patrickbehenck.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private DificuldadeMissoes dificuldade;

    // @OneToMany - Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninja;
}
