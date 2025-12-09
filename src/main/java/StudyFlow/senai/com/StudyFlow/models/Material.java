package StudyFlow.senai.com.StudyFlow.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cursos")
    private String cursos;

    @Column(name="atividades")
    private String atividades;

    @Column(name="apostila")
    private String apostila;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getApostila() {
        return apostila;
    }

    public void setApostila(String apostila) {
        this.apostila = apostila;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

/*
A Flor é bela no jardim
O jardim fica belo com a Flor
A Flor enfeita o jardim
O jardim se enobrece de tanto amor
A Flor se enche de lágrimas
O jardim inunda
Mas a Flor
A Flor nunca murcha
Porque o jardim se rega de suas lágrimas
E suas raízes ficam profundas
*/