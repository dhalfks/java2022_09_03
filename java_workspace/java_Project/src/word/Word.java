package word;

import java.util.Objects;

public class Word implements Comparable<Word>  {
	private String word;
	private String mean;
	
	public Word() {}
	
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", mean=" + mean + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소까지 일치하면 true반환
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		//word,mean이 모두 같아야만 true
		if(word == null) {
			if(other.word !=null) {
				return false;
			}
		}else if(!word.equals(other.word)) {
			return false;
		}
		
//		if(mean == null) {
//			if(other.mean != null) {
//				return false;
//			}
//		}else if(!mean.equals(other.mean)) {
//			return false;
//		}
		return true;
		//return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}

	@Override
	public int compareTo(Word o) {
		
		return word.compareTo(o.word);
	}
	
	
}
