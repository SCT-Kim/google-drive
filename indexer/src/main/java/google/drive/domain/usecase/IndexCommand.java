package google.drive.domain.usecase;

import google.drive.IndexApplication;
import google.drive.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexCommand {

    @Autowired
    IndexRepository indexRepository;
}
