package com.example.Trabajo.service;

import com.example.Trabajo.model.*;
import java.util.Optional;
import com.example.Trabajo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManejoMercanciaService {
    // ------- Cliente
    @Autowired
    private ClienteRepository clienteRepository;

    // Agregar cliente
    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    // Ver clientes
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    // Buscar un cliente
    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }
    // Editar un cliente
    public Cliente editarClientePorId(Long id, Cliente clienteDetalle) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow();
        cliente.setNombre(clienteDetalle.getNombre());
        cliente.setIdentificacion(clienteDetalle.getIdentificacion());
        return clienteRepository.save(cliente);
    }



    // ------- Empleado
    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Agregar empleado
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
    // Ver empleados
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
    // Ver un empleado
    public Optional<Empleado> buscarEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id);
    }
    // Editar un empleado
    public Empleado editarEmpleadoPorId(Long id, Empleado empleadoDetalle) {
        Empleado empleado = empleadoRepository.findById(id).orElseThrow();
        empleado.setNombre(empleadoDetalle.getNombre());
        empleado.setIdentificacion(empleadoDetalle.getIdentificacion());
        empleado.setRol(empleadoDetalle.getRol());
        empleado.setFecha_nacimiento(empleadoDetalle.getFecha_nacimiento());
        return empleadoRepository.save(empleado);
    }


    // ------- Proveedor
    @Autowired
    private ProveedorRepository proveedorRepository;

    // agregar proveedor
    public Proveedor agregarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
    // Ver proveedores
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }
    // Ver proveedor especifico
    public Optional<Proveedor> buscarProveedorPorId(Long id) {
        return proveedorRepository.findById(id);
    }
    // Editar proveedor
    public Proveedor editarProveedorPorId(Long id, Proveedor proveedorDetalle) {
        Proveedor proveedor = proveedorRepository.findById(id).orElseThrow();
        proveedor.setNombre(proveedorDetalle.getNombre());
        proveedor.setNumero_contacto(proveedorDetalle.getNumero_contacto());
        proveedor.setNombre_contacto(proveedorDetalle.getNombre_contacto());
        proveedor.setDireccion(proveedorDetalle.getDireccion());
        return proveedorRepository.save(proveedor);
    }





    // ------- Mercancia
    @Autowired
    private MercanciaRepository mercanciaRepository;

    // Agregar mercancia
    public Mercancia agregarMercancia(Mercancia mercancia) {
        return mercanciaRepository.save(mercancia);
    }
    // Ver toda la mercancia
    public List<Mercancia> listarMercancias() {
        return mercanciaRepository.findAll();
    }
    // Ver una sola mercancia
    public Optional<Mercancia> buscarMercanciaPorId(Long id) {
        return mercanciaRepository.findById(id);
    }
    // Editar mercancia
    public Mercancia editarProveedorPorId(Long id, Mercancia mercanciaDetalle) {
        Mercancia mercancia = mercanciaRepository.findById(id).orElseThrow();
        mercancia.setNombre(mercanciaDetalle.getNombre());
        mercancia.setNumero_serie(mercanciaDetalle.getNumero_serie());
        mercancia.setPrecio_compra(mercanciaDetalle.getPrecio_compra());
        mercancia.setPrecio_venta(mercanciaDetalle.getPrecio_venta());
        return mercanciaRepository.save(mercanciaDetalle);
    }




    // ------- Recibo unitario
    @Autowired
    private ReciboUnitarioRepository reciboUnitarioRepository;

    // Crear recibo
    public ReciboUnitario crearRecibo(ReciboUnitario recibo) {
        return reciboUnitarioRepository.save(recibo);
    }
    // Ver Recibos
    public List<ReciboUnitario> listarRecibos() {
        return reciboUnitarioRepository.findAll();
    }
    // Ver un recibo
    public Optional<ReciboUnitario> buscarReciboPorId(Long id) {
        return reciboUnitarioRepository.findById(id);
    }
    // Editar un recibo
    public ReciboUnitario editarReciboPorId(Long id, ReciboUnitario reciboDetalle) {
        ReciboUnitario recibo = reciboUnitarioRepository.findById(id).orElseThrow();
        recibo.setId_mercancia(reciboDetalle.getId_mercancia());
        recibo.setPrecio_unidad(reciboDetalle.getPrecio_unidad());
        recibo.setCantidad(reciboDetalle.getCantidad());
        recibo.setFecha_pedido(reciboDetalle.getFecha_pedido());
        return reciboUnitarioRepository.save(recibo);
    }



    // ------- Recibo general
    @Autowired
    private ReciboGeneralVentaRepository reciboGeneralVentaRepository;

    // Crear recibo venta
    public ReciboGeneralVenta crearReciboGeneralVenta(ReciboGeneralVenta recibo) {
        return reciboGeneralVentaRepository.save(recibo);
    }
    // ver los recibos de las ventas
    public List<ReciboGeneralVenta> listarReciboGeneralVentas() {
        return reciboGeneralVentaRepository.findAll();
    }
    // Ver un solo recibo de venta
    public Optional<ReciboGeneralVenta> buscarReciboGeneralVentaPorId(Long id) {
        return reciboGeneralVentaRepository.findById(id);
    }
    // Editar un recibo de venta
    public ReciboGeneralVenta editarReciboGeneralVentaPorId(Long id, ReciboGeneralVenta reciboDetalle) {
        ReciboGeneralVenta recibo = reciboGeneralVentaRepository.findById(id).orElseThrow();
        recibo.setId_empleado(reciboDetalle.getId_empleado());
        recibo.setId_cliente(reciboDetalle.getId_cliente());
        recibo.setId_recibo_unitario(reciboDetalle.getId_recibo_unitario());
        recibo.setPrecio_total(reciboDetalle.getPrecio_total());
        recibo.setForma_pago(reciboDetalle.getForma_pago());
        recibo.setFecha_compra(reciboDetalle.getFecha_compra());
        return reciboGeneralVentaRepository.save(recibo);
    }


    @Autowired
    private ReciboGeneralCompraRepository reciboGeneralCompraRepository;

    // Crear recibo compra
    public ReciboGeneralCompra crearReciboGeneralCompra(ReciboGeneralCompra recibo) {
        return reciboGeneralCompraRepository.save(recibo);
    }
    // Ver los recibos de las compras hechas
    public List<ReciboGeneralCompra> listarReciboGeneralCompras() {
        return reciboGeneralCompraRepository.findAll();
    }
    // Ver un solo recibo de compra
    public Optional<ReciboGeneralCompra> buscarReciboGeneralCompraPorId(Long id) {
        return reciboGeneralCompraRepository.findById(id);
    }
    // Editar un recibo de compra
    public ReciboGeneralCompra editarReciboGeneralCompra(Long id, ReciboGeneralCompra reciboDetalle) {
        ReciboGeneralCompra recibo = reciboGeneralCompraRepository.findById(id).orElseThrow();
        recibo.setId_empleado(reciboDetalle.getId_empleado());
        recibo.setId_proveedor(reciboDetalle.getId_proveedor());
        recibo.setId_recibo_unitario(reciboDetalle.getId_recibo_unitario());
        recibo.setPrecio_total(reciboDetalle.getPrecio_total());
        recibo.setForma_pago(reciboDetalle.getForma_pago());
        recibo.setFecha_compra(reciboDetalle.getFecha_compra());
        return reciboGeneralCompraRepository.save(recibo);
    }
}

