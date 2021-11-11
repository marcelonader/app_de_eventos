package br.com.event_app.repository;


import br.com.event_app.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, String>{

}
