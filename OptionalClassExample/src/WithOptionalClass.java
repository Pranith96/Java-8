import java.util.Optional;

public class WithOptionalClass {

	public static void main(String[] args) {

		String[] words = new String[15];
		Optional<String> checkNull = Optional.ofNullable(words[10]);
		if (checkNull.isPresent()) {
			String word = words[10].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is empty/Null");
	}

	/*
	 * Optional<Student> student = repository.findById(studebtId);
	 * 
	 * if(!student.isPresent()) { throw new Exception(""); }
	 * 
	 * return student.get();
	 */
}
