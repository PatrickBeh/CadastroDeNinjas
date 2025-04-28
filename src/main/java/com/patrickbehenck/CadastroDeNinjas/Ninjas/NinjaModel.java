package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import com.patrickbehenck.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

// Entity transforms a common class into a database entity
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @Column(name = "rank")
    private String rank;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;
}
