package web.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor //final �ʵ� �Ǵ�  @NonNull ���� �ʵ�� �����ڷ� �����.
public class ProductDTO {
   @NonNull
   private String code;
   
   private String name;
   
   @NonNull
   private int price;
   private String detail;
   
	public ProductDTO(String code) {
		this.code =code;
	}
   
}
