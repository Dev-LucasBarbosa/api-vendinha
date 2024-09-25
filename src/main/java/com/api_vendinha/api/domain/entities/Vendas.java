package com.api_vendinha.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "vendas") // Especifica o nome da tabela no banco de dados que será associada a esta entidade.
@NoArgsConstructor // Gera um construtor sem argumentos, necessário para a criação de instâncias da entidade pelo JPA.
@AllArgsConstructor // Gera um construtor que aceita argumentos para todos os campos, útil para criar instâncias com todos os dados.
@Data // Gera automaticamente métodos getters, setters, toString, equals e hashCode.
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor do ID será gerado automaticamente pelo banco de dados (auto-incremento).
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Produtos produtos;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Float price;
}
