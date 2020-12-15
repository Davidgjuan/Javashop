package request;

import java.util.List;

public interface InterfaceRequest<E> {

	public List<E> get();
	public E get(long id);
	public E post(E post);
	public E put(E body);
	public void delete(long id);

}
