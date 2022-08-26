import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaAtendimento {
    AtendimentoService atendimentoService;

    public BuscaAtendimento(AtendimentoService service){
        this.atendimentoService = service;
    }

    public Atendimento buscaAtendimento(String professor){

        String atendimentoJson = atendimentoService.busca(professor);

        JsonObject jsonObject = JsonParser.parseString(atendimentoJson).getAsJsonObject();

        return new Atendimento(jsonObject.get("professor").getAsString(),
                jsonObject.get("horario").getAsInt(),
                jsonObject.get("periodo").getAsString());
    }

    public boolean timeValidation(int horario) {
        boolean timeValid = atendimentoService.timeValidation(horario);

        if (timeValid) {
            return true;
        } else {
            return false;
        }
    }

    public boolean periodValidation(String period) {
        boolean periodValid = atendimentoService.periodValidation(period);

        if (periodValid) {
            return true;
        } else {
            return false;
        }
    }
}
