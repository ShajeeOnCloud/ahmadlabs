package shajee.ahmad.labs.rx.services;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rx.Observable;
import shajee.ahmad.labs.rx.entities.DataBO;
import shajee.ahmad.labs.rx.repositories.FetchNamesData;

/**
 * @author Ahmad S Alvi
 *
 */
@Service
public class DataService {

	private static final Logger log = LoggerFactory.getLogger(DataService.class);
	
	@Autowired
	private FetchNamesData namesData;
	
	public Observable<List<DataBO>> getNamesFromService(int count) {
		return Observable.<List<DataBO>>create(sub -> {
			List<DataBO> data = namesData.getNames(count);
			sub.onNext(data);
			sub.onCompleted();
		}).doOnNext(c -> log.info("Names were retrieved successfully."))
				.doOnError(e -> log.error("An ERROR occurred while retrieving the names.", e));
	}
	
	
}
