package com.dev.amil.service;

import java.util.List;

import com.dev.amil.model.MatchResult;
import com.dev.amil.model.PlayerMatch;

public interface MatchService {

	public MatchResult matchResult(List<PlayerMatch> playerMatchs);
}
