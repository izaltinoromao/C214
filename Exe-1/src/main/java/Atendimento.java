

public class Atendimento {

    private String professor;
    private int horario;
    private String periodo;

    public Atendimento(String professor, int horario, String periodo) {
        this.professor = professor;
        this.horario = horario;
        this.periodo = periodo;
    }

    public String getprofessor() {
        return professor;
    }

    public void setprofessor(String professor) {
        this.professor = professor;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
