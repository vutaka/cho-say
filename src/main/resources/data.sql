insert into event values(1, '試合日', '天心さんとの試合');
insert into event values(2, '歓迎会', '那須さんの歓迎会');

insert into event_candidate values(1, 1, '2019-02-03');
insert into event_candidate values(2, 1, '2019-02-04');
insert into event_candidate values(3, 1, '2019-02-05');
insert into event_candidate values(4, 1, '2019-02-06');

insert into event_candidate values(5, 2, '2019-02-08');
insert into event_candidate values(6, 2, '2019-02-07');
insert into event_candidate values(7, 2, '2019-02-03');
insert into event_candidate values(8, 2, '2019-02-06');

insert into participant values(1, 'メイ');
insert into participant values(2, 'ウェザー', 'お前と闘いたかった');

insert into participant_answer values(1, 1, 0);
insert into participant_answer values(2, 1, 1);
insert into participant_answer values(3, 1, 1);
insert into participant_answer values(4, 1, 9);

insert into participant_answer values(1, 2, 0);
insert into participant_answer values(2, 2, 0);
insert into participant_answer values(3, 2, 0);
insert into participant_answer values(4, 2, 9);

insert into participant_answer values(5, 1, 0);
insert into participant_answer values(6, 1, 0);
insert into participant_answer values(7, 1, 0);
insert into participant_answer values(8, 1, 0);

insert into participant_answer values(5, 2, 0);
insert into participant_answer values(6, 2, 0);
insert into participant_answer values(7, 2, 0);
insert into participant_answer values(8, 2, 0);