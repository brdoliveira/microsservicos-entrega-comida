package br.com.food.pagamentos.repository;

import br.com.food.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {
}
