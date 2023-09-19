package com.migueljo.jobsearch;

import com.beust.jcommander.JCommander;
import com.migueljo.jobsearch.api.APIFunctions;
import com.migueljo.jobsearch.api.APIJobs;
import com.migueljo.jobsearch.cli.CLIArguments;
import com.migueljo.jobsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.migueljo.jobsearch.CommanderFunctions.buildCommanderWithName;
import static com.migueljo.jobsearch.CommanderFunctions.parseArguments;

public class JobSearch {
	public static void main(String[] args) {
		System.out.println("JobSearch.main");
		JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

		Stream<CLIArguments> streamOfCLI =  parseArguments(jCommander, args, JCommander::usage)
						.orElse(Collections.emptyList())
						.stream()
						.map(object -> (CLIArguments) object);

		Optional<CLIArguments> cliArgumentsOptional = streamOfCLI
						.filter(cli -> !cli.isHelp())
						.filter(cli -> cli.getKeyword() != null)
						.findFirst();

		cliArgumentsOptional.map(CLIFunctions::toMap)
						.map(JobSearch::executeRequest)
						.orElse(Stream.empty())
						.forEach(System.out::println);
	}

	private static Stream<JobPosition> executeRequest(Map<String, Object> params) {
		APIJobs api = APIFunctions.buildAPI(APIJobs.class, "https://jobs.github.com");
		return Stream.of(params)
						.map(api::jobs)
						.flatMap(Collection::stream);
	}
}
