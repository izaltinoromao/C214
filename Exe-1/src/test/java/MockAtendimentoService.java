public class MockAtendimentoService implements AtendimentoService{

    @Override
    public String busca(String professor) {
        if(professor.equals("neto")){
            return AtendimentoConst.NETO;
        }
        return AtendimentoConst.CRISTINA;
    }
    @Override
    public boolean timeValidation(int time) {
        if(time >= 0 && time <= 23)
            return true;
        return false;
    }

    @Override
    public boolean periodValidation(String period) {
        if(period.equals("integral") || period.equals("noturno"))
            return true;
        return false;
    }


}
