package DesignPattern.Builder.Solucao;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Animal {
    private String nome;
    private String raca;
    private String dono;
}
