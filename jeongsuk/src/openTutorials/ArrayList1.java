package openTutorials;

public class ArrayList1 {
	int size = 0;
	private Object[] elementData = new Object[100];
	
	// 마지막 위치에 데이터를 추가하는 메소드
	public boolean addLast(Object element) {
		elementData[size] = element;
		
		size++;
		
		return true;
	}
	
	// 중간 위치에 데이터를 추가하는 메소드
	public boolean add(int index, Object element) {
		
		// element 중간에 데이터를 추가하기 위해 마지막 element부터 index의 노드까지 뒤로 한 칸 씩 이동시켜야 합니다.
		for(int i = size-1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		
		// index에 노드를 추가합니다.
		elementData[index] = element;
		
		// element의 숫자를 1 증가시킵니다.
		size++;
		
		return true;
	}
	
	// 처음 위치에 데이터를 추가하는 메소드
	public boolean addFirst(Object element) {
		
		// 중간에 데이터를 추가하는 메소드를 index를 0으로 하여 호출하고 결과값을 반환합니다.
		return add(0, element);
	}
	
	// 데이터를 확인하기 위해 toString 객체를 상속하여 구현합니다.
	public String toString() {
		String str = "[";
		
		for(int i = 0; i < size; i++) {
			str += elementData[i];
			if(i < size-1) {
				str += ",";
			}
		}
		
		return str + "]";
	}
	
	// 특정 위치의 데이터를 삭제하는 메소드
	public Object remove(int index) {
		// element를 삭제하기 전에 삭제할 데이터를 removed 객체에 저장합니다.
		Object removed = elementData[size];		
		
		// index 위치부터 이후 위치의 값을 이전 위치에 대입합니다.
		for(int i = index; i < size-1; i++) {
			elementData[i] = elementData[i + 1];
		}
		
		// 리스트의 크기를 1 감소시킵니다.
		size--;
		
		// 마지막 위치의 element를 명시적으로 삭제해줍니다.
		elementData[size] = null;
		
		return removed;
	}
	
	// 첫번째 element를 삭제하는 메소드
	public Object removeFirst() {
		return remove(0);
	}
	
	// 마지막 element를 삭제하는 메소드
	public Object removeLast() {
		return remove(size-1);
	}
	
	// 특정 위치의 데이터를 가져오는 메소드
	public Object get(int index) {
		return elementData[index];
	}
	
	// elemnent의 크기를 가져오는 메소드
	public int size() {
		return size;
	}
	
	// 탐색 : 특정한 값을 가지는 element의 위치를 알아내는 메소드
	// 주어진 값을 가지면 그 값과 일치하는 첫번째 element의 위치를 반환하고, 일치하는 element가 없으면 -1을 반환합니다.
	public Object indexOf(Object o) {
		for(int i=0; i < size; i++) {
			//if(elementData[i] == o) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	
    public ListIterator listIterator() {
        // ListIterator 인스턴스를 생성해서 리턴합니다.
        return new ListIterator();
    }
	
	//반복 : ArrayList의 엘리먼트를 순회하는 방법
	public class ListIterator {
		// 현재 탐색하고 있는 순서를 가리키는 인덱스 값
		private int nextIndex = 0;
		
		// next 메소드를 호출할 수 있는지를 체크합니다.
		public boolean hasNext() {
			// nextIndex가 element의 숫자보다 적다면  next를 이용해서 
			// 탐색할 element가 존재하는 것이기 때문에 true를 리턴합니다.
			return nextIndex < size();
		}
		
		// 순차적으로 element를 탐색해서 리턴합니다.
		public Object next() {
			// nextIndex에 해당하는 element를 리턴하고 nextIndex의 값을 1증가 시킵니다.
			return elementData[nextIndex++];
		}
		
		// previous 메소들 호출해도 되는지를 체크합니다.
		public boolean hasPrevious() {
			// nextIndex가 0보다 크다면 이전 element가 존재한다는 의미입니다.
			return nextIndex > size();
		}
		
		// 순차적으로 이전 노드를 리턴합니다.
		public Object previous() {
			// 이전 노드를 리턴하고 nextIndex의 값을 1갑소합니다. 
			return elementData[--nextIndex];
		}
		
		// 현재 element를 추가합니다.
		public void add(Object element) {
			ArrayList1.this.add(nextIndex++, element);
		}
		
		// 현재 element를 삭제합니다.
		public void remove(Object element) {
			ArrayList1.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
}



