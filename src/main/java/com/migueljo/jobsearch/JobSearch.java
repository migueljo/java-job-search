package com.migueljo.jobsearch;

import com.beust.jcommander.JCommander;
import com.migueljo.jobsearch.cli.CLIArguments;

import java.util.Collections;
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

		Optional<CLIArguments> cliArguments = streamOfCLI
						.filter(cli -> !cli.isHelp())
						.filter(cli -> cli.getKeyword() != null)
						.findFirst();
	}
}
