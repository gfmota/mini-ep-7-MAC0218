package domain

class AnalisadorDeAprovacao {
    var CriterioDeAprovacao criterio;

    fun defineCriterio(c:CriterioDeAprovacao) {
        criterio = c;
    }

    fun fechaBoletim(boletim:Boletim) : BoletimFechado {
        return BoletimFechado(
            boletim.mediaEPs,
            boletim.mediaMiniEPs,
            criterio.mediaFinal(boletim),
            criterio.estaAprovado(boletim)
        );
    }

}
