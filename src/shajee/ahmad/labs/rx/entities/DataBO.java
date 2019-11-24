package shajee.ahmad.labs.rx.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import shajee.ahmad.labs.rx.entities.DataBO;

@Component
public class FetchNamesData {
	
	public List<DataBO> getNames(int count)
	{
		List<DataBO> data = new ArrayList<>();
		if(count > 0)
		{
			for(long i=count; i<count+55;i++)
				data.add(DataBO.builder().tid(i).name("Name-"+i).code(i+"->Code-"+i).build());
		}
		else if(count > 5 && count <66)
		{
			for(long i=count; i<count+55;i++)
				data.add(DataBO.builder().tid(i).name("Name-"+i).code(i+"->Code-"+i).build());
		}
		else if(count > 66)
		{
			for(long i=count; i<count+55;i++)
				data.add(DataBO.builder().tid(i).name("Name-"+i).code(i+"->Code-"+i).build());
		}
		return data;
	}

}
