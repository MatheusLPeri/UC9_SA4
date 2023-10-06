package senai.UC9_SA4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senai.UC9_SA4.orm.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>
{

}
