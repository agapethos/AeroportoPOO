package ent;

import java.util.List;

public class Passagem {

    Pessoa passageiro;
    Convencional vooConvencional;
    Executivo vooConvecional;
    Integer assento;

    public void buscarAtributos(List<Passagem> passagens, String cpf) {
        for (Passagem p : passagens) {
            if (p.passageiro.getCpf().equals(cpf)) {
                System.out.println(p.toString());
            };
        }
    }

    public Integer getAssento() {
        return assento;
    }

    public void setAssento(Integer assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "*** PASSAGEM ***\n\n" + "Passageiro = " + passageiro.getNome() + "\nDecolagem: " + vooConvecional.getCidadeOrigem() + ", " + vooConvecional.getEstadoOrigem() + ", " + vooConvencional.getPaisOrigem() + "\nDesembarque: " + vooConvecional.getCidadeDestino() + ", " + vooConvecional.getEstadoDestino() + ", " + vooConvencional.getPaisDestino() + "\nAssento: " + assento + '\n';
    }
}
