package com.example.demo.controladores;

import com.example.demo.modelos.ReservaParqueadero;
import com.example.demo.modelos.ReservaZona;
import com.example.demo.modelos.Visitante;
import com.example.demo.servicios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/propietario")
public class ControladorConsultas {

	@Autowired
    private ServicioPropietario servicioPropietario;
    
    @Autowired
    private ServicioReservaZona servicioReservaZona;
   
    @GetMapping("/{id}/reservas-zona")
    public List<ReservaZona> darReservasZonaDeUnPropietario(@PathVariable Long id) {

        return servicioPropietario.darPropietario(id).getReservasZona();
    }

	 @GetMapping("/{id}/visitantes")
    public List<Visitante> darVisitantesDeUnPropietario(@PathVariable Long id) {

        return servicioPropietario.darPropietario(id).getVisitantes();
    }
	
	@GetMapping("/{id}/reservas-parqueadero")
    public List<ReservaParqueadero> darParqueaderosDeUnPropietario(@PathVariable Long id) {

        return servicioPropietario.darPropietario(id).getReservasParqueadero();
    }
    
    @GetMapping("/reservas-zona/fecha")
    public List<ReservaZona> darReservasZonaPorFecha(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {

        return servicioReservaZona.darReservasZonaPorFecha(fecha);
    }
}
