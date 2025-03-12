package com.patrickbehenck.CadastroDeNinjas.Missoes;
import com.patrickbehenck.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // @OneToMany - Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldade, List<NinjaModel> ninja) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<NinjaModel> getNinja() {
        return ninja;
    }

    public void setNinja(List<NinjaModel> ninja) {
        this.ninja = ninja;
    }
}
