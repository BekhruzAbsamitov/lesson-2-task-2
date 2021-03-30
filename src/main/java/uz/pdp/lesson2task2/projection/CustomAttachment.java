package uz.pdp.lesson2task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2task2.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Integer getId();

    String getName();

    Long getSize();

    String getExtension();

    String getPath();

    String getDescription();
}
