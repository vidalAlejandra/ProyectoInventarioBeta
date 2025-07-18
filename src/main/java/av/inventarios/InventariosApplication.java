package av.inventarios;

import av.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);

//		//Prueba de Lombok(habilitar a modo prueba)
//		Producto producto = new Producto();
//		producto.setDescripcion("Coca Cola 2L Retornable");
//		producto.setPrecio(1700.00);
//		producto.setExistencia(11);
//
//		// Imprimir el objeto toString de lombok
//		System.out.println(producto);
	}

}
