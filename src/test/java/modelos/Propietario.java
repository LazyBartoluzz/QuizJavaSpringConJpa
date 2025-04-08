package modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String cedula;
    private LocalDate fecha_visita;
    private LocalTime hora_entrada;

    @OneToMany
    private List<Visitante> visitantes;

    @OneToMany
    private List<ReservaZona> reservasZona;

    @OneToMany
    private List<ReservaParqueadero> reservasParqueadero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<ReservaZona> getReservasZona() {
        return reservasZona;
    }

    public void setReservasZona(List<ReservaZona> reservasZona) {
        this.reservasZona = reservasZona;
    }

    public List<ReservaParqueadero> getReservasParqueadero() {
        return reservasParqueadero;
    }

    public void setReservasParqueadero(List<ReservaParqueadero> reservasParqueadero) {
        this.reservasParqueadero = reservasParqueadero;
    }
}
