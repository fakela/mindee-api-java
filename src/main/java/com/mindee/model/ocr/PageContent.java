package com.mindee.model.ocr;

import com.mindee.model.fields.Field;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@Value
@EqualsAndHashCode
@ToString(callSuper = true, includeFieldNames = true)
@Builder
public class PageContent {

  private final List<Field> words;

}
