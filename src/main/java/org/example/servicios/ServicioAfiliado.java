package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloUsuarioAfiliado;

import java.util.List;

public class ServicioAfiliado {

    public void registrarAfiliado(UsuarioMembresia usuarioMembresia){
        //Nombre del traductor para hacer la persistencia
        String configuracionPersistencia="conexionbd";

        //Creamos una variable para la conexion
        //creamos una variable para manjear la conexion
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;

        try{
            entityManagerFactory= Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager=entityManagerFactory.createEntityManager();

            //crear un modelo de datos y lo voy a cargar con informacion
            ModeloUsuarioAfiliado modeloUsuarioAfiliado=new ModeloUsuarioAfiliado();
            modeloUsuarioAfiliado.setNombres(usuarioMembresia.getNombres());
            modeloUsuarioAfiliado.setDocumento(usuarioMembresia.getDocumento());

            //Inicie la transaccion
            entityManager.getTransaction().begin();

            //activar la persistencia
            entityManager.persist(modeloUsuarioAfiliado);

            //registro de la operacion
            entityManager.getTransaction().commit();

            System.out.println("exito en la transaccion, afiliado registrado con exito");
        }catch(Exception error){
            System.out.println("fallamos "+error.getMessage());
        }finally{
            if(entityManager !=null){
                entityManager.close();
            }
            if(entityManagerFactory !=null){
                entityManagerFactory.close();
            }
        }
    }

    public List<ModeloUsuarioAfiliado> buscarAfiliados(){
        return null;
    }

}
