package basic;

public interface BasicOperation<T> {
	public T operation(T a, T b);

	public String getOperationId();
}
