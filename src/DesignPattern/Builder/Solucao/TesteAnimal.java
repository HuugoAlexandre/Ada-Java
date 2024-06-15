package DesignPattern.Builder.Solucao;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
        .nome("mel")
        .dono("matheus")
        .raca("pastor alemao")
        .build();

        System.out.println(animal);
    }
}
