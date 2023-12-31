package elbuensabor.controllers;

import elbuensabor.entities.DetallePedido;
import elbuensabor.services.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/DetallePedido")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl>{
}
