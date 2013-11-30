package org.eligosource.eventsourced.journal.inmem

trait InmemJournalLifecycle {
  private lazy val props = InmemJournalProps()
  def journalProps = props
  def readOnlyJournalProps = props.withReadOnly(true)

}
