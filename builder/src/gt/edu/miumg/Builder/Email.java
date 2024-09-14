package gt.edu.miumg.Builder;

import java.util.List;
import java.util.ArrayList;

public class Email {
    private  final List<String> destinatarios;
    private final String asunto;
    private final String cuerpo;
    private final  List<String> adjuntos;

    private Email(builderEmail builder) {
        this.destinatarios = builder.destinatarios;
        this.asunto = builder.asunto;
        this.cuerpo = builder.cuerpo;
        this.adjuntos = builder.adjuntos;
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public List<String> getAdjuntos() {
        return adjuntos;
    }



    public static class builderEmail{

        private List<String> destinatarios = new ArrayList<>();
        private String asunto;
        private String cuerpo;
        private List<String> adjuntos = new ArrayList<>();

        public builderEmail adddestinatarios (String destinatarios)
        {
            this.destinatarios.add(destinatarios);
            return this;
        }


        public builderEmail setasunto(String asunto) {
            this.asunto = asunto;
            return this;
        }


        public builderEmail setcuerpo(String cuerpo) {
            this.cuerpo = cuerpo;
            return this;
        }

        public builderEmail setadjuntos(String adjuntos) {
            this.adjuntos.add(adjuntos);
            return this;
        }


        public Email build(){
            if (destinatarios.isEmpty() ||  asunto== null || cuerpo == null){
            throw  new IllegalStateException("Para que la acion se pueda ejecutar correctamente llenar lo que se te pide. ");
             }
            return  new Email(this);
        }


    }
}
