/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.CL1.LaboratI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.CL1.LaboratI.domain.Usuario;


public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
    Usuario findByUsername(String username);
    
}
