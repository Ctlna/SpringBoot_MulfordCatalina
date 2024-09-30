package com.example.Trabajo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Trabajo.model.*;
import com.example.Trabajo.service.ManejoMercanciaService;

import java.util.List;

@RestController
@RequestMapping("/api/ControlManejoMercancias")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ManejoSistema {

    @Autowired
    private ManejoMercanciaService manejoMercanciaService;

    // ---------- Cliente
    // Asignar
    @PostMapping("/cliente")
    public Cliente asignaCliente(@RequestBody Cliente cliente) {
        return manejoMercanciaService.agregarCliente(cliente);
    }
    //Ver
    @GetMapping("/clientes")
    public List<Cliente> verClientes(){
        return manejoMercanciaService.listarClientes();
    }

    @GetMapping("/cliente/{id}")
    public Cliente verCliente(@PathVariable Long id) {
        return manejoMercanciaService.buscarClientePorId(id).orElseThrow();
    }
    // Editar
    @PutMapping("/cliente/{id}")
    public Cliente modificaCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        return manejoMercanciaService.editarClientePorId(id, cliente);
    }


    // ---------- Empleado
    // Agregar
    @PostMapping("/empleado")
    public Empleado asignaEmpleado(@RequestBody Empleado empleado) {
        return manejoMercanciaService.agregarEmpleado(empleado);
    }
    // Ver
    @GetMapping("/empleados")
    public List<Empleado> verEmpleados(){
        return manejoMercanciaService.listarEmpleados();
    }
    @GetMapping("/empleado/{id}")
    public Empleado verEmpleado(@PathVariable Long id) {
        return manejoMercanciaService.buscarEmpleadoPorId(id).orElseThrow();
    }
    // Editar
    @PutMapping("/empleado/{id}")
    public Empleado modificaEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        return manejoMercanciaService.editarEmpleadoPorId(id, empleado);
    }


    // ----------- Proveedor
    // Agregar
    @PostMapping("/proveedor")
    public Proveedor asignaProveedor(@RequestBody Proveedor proveedor) {
        return manejoMercanciaService.agregarProveedor(proveedor);
    }
    // Ver
    @GetMapping("/proveedores")
    public List<Proveedor> verProveedores() {
        return manejoMercanciaService.listarProveedores();
    }
    @GetMapping("/proveedor/{id}")
    public Proveedor verProveedor(@PathVariable Long id) {
        return manejoMercanciaService.buscarProveedorPorId(id).orElseThrow();
    }
    // Editar
    @PutMapping("/proveedor/{id}")
    public Proveedor modificaProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        return manejoMercanciaService.editarProveedorPorId(id, proveedor);
    }


    // ------------ Mercancia
    //Agregar
    @PostMapping("/mercancia")
    public Mercancia asignaMercancia(@RequestBody Mercancia mercancia) {
        return manejoMercanciaService.agregarMercancia(mercancia);
    }
    // Ver
    @GetMapping("/mercancias")
    public List<Mercancia> verMercancias(){
        return manejoMercanciaService.listarMercancias();
    }

    @GetMapping("/mercancia/{id}")
    public Mercancia verMercanciaporId(@PathVariable Long id) {
        return manejoMercanciaService.buscarMercanciaPorId(id).orElseThrow();
    }
    // Editar
    @PutMapping("/mercancia/{id}")
    public Mercancia modificaMercancia(@PathVariable Long id, @RequestBody Mercancia mercancia) {
        return manejoMercanciaService.editarProveedorPorId(id,mercancia);
    }


    // ------------- Recibo unitario
    // Agregar
    @PostMapping("/reciboUnitario")
    public ReciboUnitario crearReciboUnitario(@RequestBody ReciboUnitario reciboUnitario) {
        return manejoMercanciaService.crearRecibo(reciboUnitario);
    }
    // Ver
    @GetMapping("/recibosUnitario")
    public List<ReciboUnitario> verRecibosUnitario(){
        return manejoMercanciaService.listarRecibos();
    }
    @GetMapping("/reciboUnitario/{id}")
    public ReciboUnitario verRecibosUnitario(@PathVariable Long id) {
        return manejoMercanciaService.buscarReciboPorId(id).orElseThrow();
    }
    // Editar
    @PutMapping("/reciboUnitario/{id}")
    public ReciboUnitario modificaReciboUnitario(@PathVariable Long id, @RequestBody ReciboUnitario reciboUnitario) {
        return manejoMercanciaService.editarReciboPorId(id, reciboUnitario);
    }


    // ------------ Recibo general venta
    @PostMapping("/reciboVenta")
    public ReciboGeneralVenta crearReciboVenta(@RequestBody ReciboGeneralVenta reciboGeneralVenta) {
        return manejoMercanciaService.crearReciboGeneralVenta(reciboGeneralVenta);
    }
    @GetMapping("/recibosVentas")
    public List<ReciboGeneralVenta> verRecibosVentas(){
        return manejoMercanciaService.listarReciboGeneralVentas();
    }
    @GetMapping("/reciboVenta/{id}")
    public ReciboGeneralVenta verRecibosVentas(@PathVariable Long id) {
        return manejoMercanciaService.buscarReciboGeneralVentaPorId(id).orElseThrow();
    }
    @PutMapping("/reciboVenta/{id}")
    public ReciboGeneralVenta modificarReciboVenta(@PathVariable Long id, @RequestBody ReciboGeneralVenta reciboGeneralVenta) {
        return manejoMercanciaService.editarReciboGeneralVentaPorId(id, reciboGeneralVenta);
    }


    // ----------- Recibo general compra
    // Agregar
    @PostMapping("reciboCompra")
    public ReciboGeneralCompra crearReciboCompra(@RequestBody ReciboGeneralCompra reciboGeneralCompra) {
        return manejoMercanciaService.crearReciboGeneralCompra(reciboGeneralCompra);
    }
    // Ver
    @GetMapping("/recibosCompra")
    public List<ReciboGeneralCompra> verRecibosCompras(){
        return manejoMercanciaService.listarReciboGeneralCompras();
    }
    @GetMapping("/reciboCompra/{id}")
    public ReciboGeneralCompra verRecibosCompra(@PathVariable Long id) {
        return manejoMercanciaService.buscarReciboGeneralCompraPorId(id).orElseThrow();
    }
    // Editar
    @PutMapping("/reciboCompra/{id}")
    public ReciboGeneralCompra modificarReciboCompra(@PathVariable Long id, @RequestBody ReciboGeneralCompra reciboGeneralCompra) {
        return manejoMercanciaService.editarReciboGeneralCompra(id, reciboGeneralCompra);
    }
}